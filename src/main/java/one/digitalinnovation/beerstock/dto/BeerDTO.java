package one.digitalinnovation.beerstock.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerstock.enums.BeerType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {
	
	private Long id;
	
	@NotNull
	@Size(min=2, max=200)
	private String name;

	@NotNull
	@Size(min=2, max=200)
	private String brand;
	
	@NotNull
	@Max(500)
	private int max;
	
	@NotNull
	@Max(100)
	private int quantity;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private BeerType type;
}

