package individual.spring_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordController {

	@Autowired
	private RecordRepository recordRepository;
	
	@GetMapping
	public List<RecordObject> getRecords() {
		return recordRepository.selectRecords();
	}
	
}
