package individual.spring_api;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class RecordRepository {

	private static final List<RecordObject> records = new ArrayList<>();

	static {
		RecordObject record = new RecordObject();
		record.setIdentifier(UUID.randomUUID().toString().replace("-", "").substring(0, 16));
		records.add(record);
	}

	public List<RecordObject> selectRecords() {
		return records;
	}

}
