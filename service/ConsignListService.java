package com.kh.team.service;

import java.util.List;

import com.kh.team.domain.ConsignListPagingDto;
import com.kh.team.domain.ConsignVo;
import com.kh.team.domain.WishlistPagingDto;

public interface ConsignListService {

	// 위탁 목록
	public List<ConsignVo> consignList(String m_id, int startRow, int endRow) throws Exception;
	
	// 위탁 게시글 수
	public int getCount(ConsignListPagingDto consignListPagingDto, String m_id) throws Exception;
	
}
