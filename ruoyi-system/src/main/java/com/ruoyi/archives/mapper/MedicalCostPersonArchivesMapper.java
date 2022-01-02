package com.ruoyi.archives.mapper;

import java.util.List;
import com.ruoyi.archives.domain.MedicalCostPersonArchives;

/**
 * 个人档案Mapper接口
 * 
 * @author 张裕
 * @date 2022-01-02
 */
public interface MedicalCostPersonArchivesMapper 
{
    /**
     * 查询个人档案
     * 
     * @param id 个人档案主键
     * @return 个人档案
     */
    public MedicalCostPersonArchives selectMedicalCostPersonArchivesById(String id);

    /**
     * 查询个人档案列表
     * 
     * @param medicalCostPersonArchives 个人档案
     * @return 个人档案集合
     */
    public List<MedicalCostPersonArchives> selectMedicalCostPersonArchivesList(MedicalCostPersonArchives medicalCostPersonArchives);

    /**
     * 新增个人档案
     * 
     * @param medicalCostPersonArchives 个人档案
     * @return 结果
     */
    public int insertMedicalCostPersonArchives(MedicalCostPersonArchives medicalCostPersonArchives);

    /**
     * 修改个人档案
     * 
     * @param medicalCostPersonArchives 个人档案
     * @return 结果
     */
    public int updateMedicalCostPersonArchives(MedicalCostPersonArchives medicalCostPersonArchives);

    /**
     * 删除个人档案
     * 
     * @param id 个人档案主键
     * @return 结果
     */
    public int deleteMedicalCostPersonArchivesById(String id);

    /**
     * 批量删除个人档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMedicalCostPersonArchivesByIds(String[] ids);
}
