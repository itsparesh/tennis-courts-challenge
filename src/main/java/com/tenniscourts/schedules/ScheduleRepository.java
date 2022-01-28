package com.tenniscourts.schedules;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findByTennisCourt_IdOrderByStartDateTime(Long id);

    List<Schedule> findByIdLike(Long id);

    List<Schedule> findByStartDateTimeIsGreaterThanEqualAndEndDateTimeIsLessThanEqual(@NonNull LocalDateTime startDateTime, @NonNull LocalDateTime endDateTime);



}