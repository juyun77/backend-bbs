package me.hello.backend.bbs.dao;

import java.util.List;
import me.hello.backend.bbs.domain.Bbs;
import me.hello.backend.bbs.dto.param.BbsCountParam;
import me.hello.backend.bbs.dto.param.BbsListParam;
import me.hello.backend.bbs.dto.param.CreateBbsAnswerParam;
import me.hello.backend.bbs.dto.param.CreateBbsParam;
import me.hello.backend.bbs.dto.param.CreateReadCountParam;
import me.hello.backend.bbs.dto.param.UpdateBbsParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface BbsDao {

	List<Bbs> getBbsSearchPageList(BbsListParam param);
	Integer getBbsCount(BbsCountParam param);

	Bbs getBbs(Integer seq);
	Integer createBbsReadCountHistory(CreateReadCountParam param);
	Integer increaseBbsReadCount(Integer seq);

	void createBbs(CreateBbsParam param);

	Integer updateBbsStep(Integer parentSeq);
	Integer getBbsAnswerCount(Integer parentSeq);
	void createBbsAnswer(CreateBbsAnswerParam param);

	Integer updateBbs(UpdateBbsParam param);

	Integer deleteBbs(Integer seq);
}
