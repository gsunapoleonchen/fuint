package com.fuint.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fuint.common.dto.BookDto;
import com.fuint.framework.pagination.PaginationRequest;
import com.fuint.framework.pagination.PaginationResponse;
import com.fuint.framework.exception.BusinessCheckException;
import com.fuint.repository.model.MtBook;
import java.util.List;
import java.util.Map;

/**
 * 预约业务接口
 *
 * Created by FSQ
 * CopyRight https://www.fuint.cn
 */
public interface BookService extends IService<MtBook> {

    /**
     * 分页查询预约列表
     *
     * @param paginationRequest
     * @return
     */
    PaginationResponse<BookDto> queryBookListByPagination(PaginationRequest paginationRequest) throws BusinessCheckException;

    /**
     * 添加预约
     *
     * @param  mtBook
     * @throws BusinessCheckException
     * @return
     */
    MtBook addBook(MtBook mtBook) throws BusinessCheckException;

    /**
     * 根据ID获取预约项目信息
     *
     * @param  id 预约项目ID
     * @throws BusinessCheckException
     * @return
     */
    BookDto getBookById(Integer id) throws BusinessCheckException;

    /**
     * 更新预约项目
     *
     * @param  mtBook
     * @throws BusinessCheckException
     * @return
     * */
    MtBook updateBook(MtBook mtBook) throws BusinessCheckException;

    /**
     * 根据条件搜索预约项目
     *
     * @param  params 查询参数
     * @throws BusinessCheckException
     * @return
     * */
    List<MtBook> queryBookListByParams(Map<String, Object> params) throws BusinessCheckException;

}
