package com.dalong.dnflogs.dnflogs.repository;

/**
 * Created by dalong on 04/11/2018.
 */

import org.springframework.data.repository.CrudRepository;
import com.dalong.dnflogs.dnflogs.entity.Character;

public interface CharacterRepository extends CrudRepository<Character, Long> {}

