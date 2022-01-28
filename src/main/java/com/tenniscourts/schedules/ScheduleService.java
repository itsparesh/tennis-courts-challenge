package com.tenniscourts.schedules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Resource
    private final ScheduleMapper scheduleMapper;

    public ScheduleDTO addSchedule(Long tennisCourtId, CreateScheduleRequestDTO createScheduleRequestDTO) {

        return scheduleMapper.map(scheduleMapper.map(new ScheduleDTO(tennisCourtId, createScheduleRequestDTO.getStartDateTime())));
    }

    public List<ScheduleDTO> findSchedulesByDates(LocalDateTime startDate, LocalDateTime endDate) {
        scheduleMapper.map(scheduleRepository.findByStartDateTimeIsGreaterThanEqualAndEndDateTimeIsLessThanEqual(startDate, endDate));
        return null;
    }

    public ScheduleDTO findSchedule(Long scheduleId) {
        ScheduleDTO scheduleDTO = new ScheduleDTO();
        return scheduleMapper.map(scheduleRepository.findByIdLike(scheduleId)).get(0);
    }

    public List<ScheduleDTO> findSchedulesByTennisCourtId(Long tennisCourtId) {
        return scheduleMapper.map(scheduleRepository.findByTennisCourt_IdOrderByStartDateTime(tennisCourtId));
    }
}
