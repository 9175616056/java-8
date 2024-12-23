package practice;

@Service
public class patientservicee {

	@Autowired
	private repository r;
	
	public void save(patient patient) {
	Patient patient=r.save(patient);
	return patien;
	}
}
