package com.dalong.dnflogs.dnflogs.Repository;

/**
 * Created by dalong on 04/11/2018.
 */

import org.springframework.data.repository.CrudRepository;
import com.dalong.dnflogs.dnflogs.Entity.Character;

public interface CharacterRepository extends CrudRepository<Character, Long> {}

