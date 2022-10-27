package com.example.picreel.repository;

import com.example.picreel.model.PicreelModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicreelRepository extends JpaRepository<PicreelModel, Long> {
}
