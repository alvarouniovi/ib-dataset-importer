package es.um.asio.importer.cnv.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.um.asio.abstractions.dto.ImportResultDto;
import es.um.asio.importer.cnv.service.CvnImportInfoService;
import es.um.asio.importer.util.RestPageImpl;


/**
 * Service that provides information about CVN imports.
 */
@Service
public class CvnImportInfoServiceImpl implements CvnImportInfoService {

    /** 
     * The rest template. 
     * */
    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${app.services.input-processor-service}")
    private String baseUrl;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Date findDateOfLastImport() {
        String uri = baseUrl + "/import-result/search?jobType=CVN&exitStatusCode=COMPLETED&page=0&size=1&sort=startTime,desc";    
        ParameterizedTypeReference<RestPageImpl<ImportResultDto>> responseType = new ParameterizedTypeReference<RestPageImpl<ImportResultDto>>() { };
         
        RestPageImpl<ImportResultDto> importResultsPaged = restTemplate.exchange(uri, HttpMethod.GET, null, responseType).getBody(); 
        
        if(importResultsPaged.isEmpty()) {
            return null;
        }        
        return importResultsPaged.getContent().get(0).getStartTime();
    }
}
