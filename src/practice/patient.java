package practice;

@entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Tablw(name="paient")
public class patient {
	
	@Id
	@Generatedvalue(strategy=generationtype.Identity);
	private long id;
	private String name;
	private String email;
	private String address;

}
