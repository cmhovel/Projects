package GogiMeIntellij;

//import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The offer class represents a single special offer that an advertiser or professional service user can create to offer to the sports enthusiasts.
 */
public class Offer{

    private String company;
    private String product;
    private BigDecimal price;
    private LocalDate expirationDate;

    /**
     * The main constructor for the offer.
     * @param company
     * @param product
     * @param price
     * @param expirationDate
     */
    public Offer(String company, String product, BigDecimal price, LocalDate expirationDate) {
        this.company = company;
        this.product = product;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    /**
     * Returns the company offering the deal.
     * @return
     */
    public String getCompany() {
        return company;
    }

    /**
     * Returns the product being offered.
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * Returns the price being offered.
     * @return
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the price.
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Returns the date that the offer expires.
     * @return
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets a new expiration date.
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * An equals method to specifically compare Offers.
     * @param o
     * @return
     */
    public boolean equals(Offer o){
        if(this.getCompany().equals(o.getCompany()) && this.getExpirationDate().equals(o.getExpirationDate()) && this.getProduct().equals(o.getProduct()) && this.getPrice().equals(o.getPrice())){
            return true;
        } else{
            return false;
        }
    }


}
