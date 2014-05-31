package domain;

import java.net.URI;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase que representa a un evento de memoria con sus atributos
 * @author fbobbio
 *
 */
@Entity
public class MEvent {
	
	private int id;
	private Date date;
	private Date creationDate;
	private String title;
	private Category category;
	private Country country;
	private String shortDescription;
	private String longDescription;
	private String link;
	private URI imagenUrl;
	private int rate;
	
	protected MEvent() {
		
	}

    public MEvent(int id, Date date, Date creationDate, String title,
			Category category, Country country, String shortDescription,
			String longDescription, String link, URI imagenUrl, int rate) {
		super();
		this.id = id;
		this.date = date;
		this.creationDate = creationDate;
		this.title = title;
		this.category = category;
		this.country = country;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.link = link;
		this.imagenUrl = imagenUrl;
		this.rate = rate;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public URI getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(URI imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}
