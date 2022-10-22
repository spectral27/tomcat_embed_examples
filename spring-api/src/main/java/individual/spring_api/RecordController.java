package individual.spring_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/records")
public class RecordController {

	@Autowired
	private RecordRepository recordRepository;
	
	@GetMapping
	public List<Record> getRecords() {
		return recordRepository.getRecords();
	}
	
	@PostMapping
	public void saveRecord(@RequestBody Record record) {
		recordRepository.saveRecord(record);
	}
	
}
