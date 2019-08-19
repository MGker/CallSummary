package com.callsummary.mapper;

import com.callsummary.model.CallSummary;
import com.callsummary.model.CallSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallSummaryMapper {
    long countByExample(CallSummaryExample example);

    int deleteByExample(CallSummaryExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(CallSummary record);

    int insertSelective(CallSummary record);

    List<CallSummary> selectByExample(CallSummaryExample example);

    CallSummary selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") CallSummary record, @Param("example") CallSummaryExample example);

    int updateByExample(@Param("record") CallSummary record, @Param("example") CallSummaryExample example);

    int updateByPrimaryKeySelective(CallSummary record);

    int updateByPrimaryKey(CallSummary record);
}