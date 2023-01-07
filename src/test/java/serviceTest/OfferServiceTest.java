package serviceTest;

import com.mhn.storewebappjakartaee.model.entity.Offer;
import com.mhn.storewebappjakartaee.model.service.OfferService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OfferServiceTest {
    private OfferService offerService = OfferService.getOfferService();

    @Test
    void saveTest() throws Exception{
        Offer offer = new Offer();
        offer.setPrice(9999.9);
        offer = offerService.save(offer);
        assertNotNull(offer.getId());
    }

    @Test
    void updateTest() throws Exception{
        Offer offer = new Offer();
        offer.setPrice(123432.23);
        offer = offerService.save(offer);
        assertNotNull(offer.getId());
        offer.setPrice(9999.8888);
        offer = offerService.update(offer);
        assertEquals(9999.8888,offer.getPrice());
    }

    @Test
    void deleteTest() throws Exception{
        Offer offer = new Offer();
        offer.setPrice(1234.234);
        offer = offerService.save(offer);
        assertNotNull(offer.getId());
        offerService.delete(offer.getId());
        offer = offerService.findById(offer.getId());
        assertNull(offer);
    }

    @Test
    void findAllTest() throws Exception{
        Offer offer1 = new Offer();
        offer1.setPrice(234.23);
        Offer offer2 = new Offer();
        offer2.setPrice(543.34);
        offerService.save(offer1);
        offerService.save(offer2);
        List<Offer> offerList = offerService.findAll();
        assertEquals(2,offerList.size());
    }

    @Test
    void findById() throws Exception{
        Offer offer = new Offer();
        offer.setPrice(253.34);
        offer = offerService.save(offer);
        assertNotNull(offer.getId());
        Offer findOfferById = offerService.findById(offer.getId());
        assertEquals(offer.getPrice(),findOfferById.getPrice());
    }
}
