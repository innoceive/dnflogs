package com.dalong.dnflogs.dnflogs.service;

import com.dalong.dnflogs.dnflogs.domain.dto.ServerInfoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * Created by dalong on 04/11/2018.
 */

public interface NeopleOpenAPIService {
    public List<ServerInfoDTO> findAll();
}
