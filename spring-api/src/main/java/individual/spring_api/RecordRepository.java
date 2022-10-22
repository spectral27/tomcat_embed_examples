package individual.spring_api;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public class RecordRepository {

	private static List<Record> records = new ArrayList<>();

	{
		Record record = new Record();
		record.setId("1");
		record.setRecordValue("recordValue");
		record.setLocalDateTime(LocalDateTime.now().withNano(0));

		records.add(record);
	}

	public List<Record> getRecords() {
		return records;
	}

	public void saveRecord(Record record) {
		record.setId(UUID.randomUUID().toString());

		if (record.getLocalDateTime() == null) {
			record.setLocalDateTime(LocalDateTime.now().withNano(0));
		}

		records.add(record);
	}

}
