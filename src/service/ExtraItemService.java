package service;

import java.util.List;

import model.ExtraItem;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ExtraItemService {
	
	public List<ExtraItem> findExtraItemsByIdBooking(Integer id_booking);
	public Integer insertExtraItem(ExtraItem extraItem);
	public Integer deleteExtraItemsByIdBooking(Integer id_booking);
}