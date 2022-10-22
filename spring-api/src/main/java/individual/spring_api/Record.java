package individual.spring_api;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Record {
	
	private String id;
	private String recordValue;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private LocalDateTime localDateTime;
	
	public Record() {
		
	}
	
	public Record(String id, String recordValue, LocalDateTime localDateTime) {
		this.id = id;
		this.recordValue = recordValue;
		this.localDateTime = localDateTime;
	}

}
