package com.hunter.demoLoadElisticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.hunter.demoLoadElisticsearch.model.Device;

@Repository
public interface DeviceElasticsearchRepository extends ElasticsearchRepository<Device, String> {

}
