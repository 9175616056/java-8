package practice;

@RestController
@Requesmapping("/patient")
public class patientcontroller {
	
	private patientservicee p;
	
	@PostMaping("/create")
	public ResponseEntity<patient>create(RequestBody Patient patient){
		return new ResponseEntity(p.save(patient,http.status.created));
	}

}
