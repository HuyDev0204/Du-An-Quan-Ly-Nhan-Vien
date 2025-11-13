package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.fpoly.model.NhanVienModel;
@Repository
public interface NhanVienRepository  extends JpaRepository<NhanVienModel, Integer>{

}
