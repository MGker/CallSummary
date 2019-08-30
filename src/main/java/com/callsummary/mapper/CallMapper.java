package com.callsummary.mapper;

import com.callsummary.model.Call;
import com.callsummary.model.CallExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallMapper {
    long countByExample(CallExample example);

    int deleteByExample(CallExample example);

    int deleteByPrimaryKey(String callreference);

    int insert(Call record);

    int insertSelective(Call record);

    List<Call> selectByExample(CallExample example);

    Call selectByPrimaryKey(String callreference);

    int updateByExampleSelective(@Param("record") Call record, @Param("example") CallExample example);

    int updateByExample(@Param("record") Call record, @Param("example") CallExample example);

    int updateByPrimaryKeySelective(Call record);

    int updateByPrimaryKey(Call record);

    /**
     * 获取当天没有电话小结的录音记录集合
     * @return
     */
    List<Call> selectNotHasSummaryCallList(@Param("startDate") Long startTime, @Param("endDate")Long endDate);
}