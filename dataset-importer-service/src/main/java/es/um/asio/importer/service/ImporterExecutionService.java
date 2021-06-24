package es.um.asio.importer.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import es.um.asio.importer.dto.ImportExecutionVO;

public interface ImporterExecutionService {
	
	public List<ImportExecutionVO> findImporterExecutions(Pageable pageable);
}
