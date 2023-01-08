package cn.iocoder.yudao.module.mp.dal.mysql.menu;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.mp.dal.dataobject.menu.MpMenuDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MpMenuMapper extends BaseMapperX<MpMenuDO> {

    default MpMenuDO selectByAppIdAndMenuKey(String appId, String menuKey) {
        return selectOne(MpMenuDO::getAppId, appId,
                MpMenuDO::getMenuKey, menuKey);
    }

}