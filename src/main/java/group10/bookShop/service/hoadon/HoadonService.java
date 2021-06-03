package group10.bookShop.service.hoadon;

import java.util.List;
import java.util.UUID;

import group10.bookShop.entities.Hoadon;
import group10.bookShop.entities.Sach;

public interface HoadonService {
	List<Hoadon> findAll();
	
	List<Hoadon> findMadonhangDesc();
	
	List<Hoadon> search(int madonhang);
	
	Hoadon findById(int madonhang);
	
	List<Hoadon> findByMasach(int masach);
	
	void save(Hoadon hoadon);
	
	void delete(int madonhang);
}
