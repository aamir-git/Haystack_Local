package org.projecthaystack.bmp.platformbus;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

public abstract class BMPv2_PlatformBus implements MqttCallback {

	String module_name = "";
	String broker = "";
	String broker_url = "";
	String port= "";
	String protocol = "";
	MqttMessage message;
	MqttClient mqtt_client = null;
	
	public BMPv2_PlatformBus(String m_name) {
		
		broker = "10.242.142.93";
		port = "1883";
		protocol = "tcp://";
		broker_url = protocol+broker+":"+port;
		module_name = m_name;
		String client_id = module_name;
				
		try {
			mqtt_client = new MqttClient(broker_url,client_id);
			
			mqtt_client.setCallback(this);
			mqtt_client.connect();
			String subscribe_topic = "+/"+module_name;
			mqtt_client.subscribe(subscribe_topic);
			
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public abstract void pbus_onreceive(String topic,String payload);
	
	public void pbus_send(String destination, String payload) {
		String response_topic = this.module_name+"/"+destination;
		this.message = new MqttMessage(payload.getBytes());
		try {
			this.mqtt_client.publish(response_topic,message);
		} catch (MqttPersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void connectionLost(Throwable arg0) {
		// TODO Auto-generated method stub
		
	}


	public void deliveryComplete(IMqttDeliveryToken arg0) {
		// TODO Auto-generated method stub
		
	}


	public void messageArrived(String topic, MqttMessage message) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bmp: Topic: "+topic+" payload: "+message.getPayload().toString());
		this.pbus_onreceive(topic,new String(message.getPayload()));
	}
}
