package com.impaq.arena.server.login.player

import org.springframework.data.jpa.repository.JpaRepository

public interface PlayerRepository extends JpaRepository<Player, String> { }