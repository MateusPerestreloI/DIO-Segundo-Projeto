package one.digitalinnovation.beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {
	
	LAGER("Lager"),
	MALZBIER("Malzibier"),
	WITBIER("Witbier"),
	WEISS("Weiss"),
	ALE("Ale"),
	IPA("Ipa"),
	STOUT("Stout");
	
	private final String description;
}
