package org.spring.boot.multiple.ds.dao;

import org.spring.boot.multiple.ds.bean.Tvoucher;
import org.spring.boot.multiple.ds.bean.TvoucherEntry;
import org.springframework.stereotype.Component;

/**
 * @author 刘世杰
 * @date 2019/8/20
 * 商品移仓单金蝶dao
 */
@Component
public interface MerchandiseShiftKingDeeDao {

    /**
     * 查询新增前的最后一条凭证数据
     * resolve: 无法获取自增主键
     * @return
     */
    Tvoucher selectLastVoucher();

    /**
     * 新增凭证数据
     * @param tvoucher: 凭证数据
     * @return
     */
    int addVoucher(Tvoucher tvoucher);

    /**
     * 根据字段值查询t_item表对应的FItemID
     * @param debit
     * @return
     */
    Object selectFItemID(String debit);

    /**
     * 新增凭证分录数据
     * @param tvoucherEntryTotal: 分录数据
     * @return
     */
    int addVoucherEntry(TvoucherEntry tvoucherEntryTotal);
}
