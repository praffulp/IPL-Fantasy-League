package dao.bidder;

import java.util.List;

import model.Bidder;

public interface BidderLoginDao {
	public void validateUser(String email,String password);

}
