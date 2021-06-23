package es.um.asio.importer.back.controller;

import java.security.InvalidParameterException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.um.asio.domain.importer.ImporterSchedule;
import es.um.asio.importer.back.dto.DataImporterDTO;
import es.um.asio.importer.back.mapper.ImporterMapper;
import es.um.asio.importer.service.ImporterSchedulerService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Import dataset controller.
 */
@RestController
@RequestMapping(ImporterController.Mappings.BASE)
public class ImporterController {
	
	@Autowired
	private ImporterSchedulerService importerSchedulerService;
	
	@Autowired
	private ImporterMapper importerMapper;
	
	@PostMapping(value = ImporterController.Mappings.SCHEDULE)
	public ResponseEntity<Void> schedule(@RequestBody @Valid DataImporterDTO dataImporterDTO) {
		ImporterSchedule importerSchedule = importerMapper.mapDataImporterDTOToImporterSchedule(dataImporterDTO);
		importerSchedulerService.createSchedule(importerSchedule);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ExceptionHandler(InvalidParameterException.class)
	public ResponseEntity<Void> handleInvalidParameterException() {
		 return new ResponseEntity<Void>(HttpStatus.UNPROCESSABLE_ENTITY);
	}
		
	/**
     * Mappgins.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    static final class Mappings {
        /**
         * Controller request mapping.
         */
        protected static final String BASE = "/importer";
        
        /**
         * Mapping for schedule.
         */
        protected static final String SCHEDULE = "/schedule";

    }
}
