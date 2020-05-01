package com.hunter.demoLoadElisticsearch.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.hunter.demoLoadElisticsearch.model.Device;
import com.hunter.demoLoadElisticsearch.repository.DeviceElasticsearchRepository;

@Component
public class DeviceElasticsearchDatasource {
	
	@Autowired
	private DeviceElasticsearchRepository deviceElasticsearchRepository;
	
	@EventListener(org.springframework.boot.context.event.ApplicationReadyEvent.class)
	public void saveDevicesInfo(){
		
		List<Device> devices = createDevicesInfo();
		deviceElasticsearchRepository.saveAll(devices);
		
	}
	
	private List<Device> createDevicesInfo(){
		
		List<Device> devices = new ArrayList<Device>();
		return devices;
		
	}
	

}
