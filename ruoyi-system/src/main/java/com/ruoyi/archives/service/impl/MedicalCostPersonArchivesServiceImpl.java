package com.ruoyi.archives.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.archives.mapper.MedicalCostPersonArchivesMapper;
import com.ruoyi.archives.domain.MedicalCostPersonArchives;
import com.ruoyi.archives.service.IMedicalCostPersonArchivesService;

/**
 * 个人档案Service业务层处理
 * 
 * @author 张裕
 * @date 2022-01-02
 */
@Service
public class MedicalCostPersonArchivesServiceImpl implements IMedicalCostPersonArchivesService 
{
    @Autowired
    private MedicalCostPersonArchivesMapper medicalCostPersonArchivesMapper;

    /**
     * 查询个人档案
     * 
     * @param id 个人档案主键
     * @return 个人档案
     */
    @Override
    public MedicalCostPersonArchives selectMedicalCostPersonArchivesById(String id)
    {
        return medicalCostPersonArchivesMapper.selectMedicalCostPersonArchivesById(id);
    }

    /**
     * 查询个人档案列表
     * 
     * @param medicalCostPersonArchives 个人档案
     * @return 个人档案
     */
    @Override
    public List<MedicalCostPersonArchives> selectMedicalCostPersonArchivesList(MedicalCostPersonArchives medicalCostPersonArchives)
    {
        return medicalCostPersonArchivesMapper.selectMedicalCostPersonArchivesList(medicalCostPersonArchives);
    }

    /**
     * 新增个人档案
     * 
     * @param medicalCostPersonArchives 个人档案
     * @return 结果
     */
    @Override
    public int insertMedicalCostPersonArchives(MedicalCostPersonArchives medicalCostPersonArchives)
    {
        return medicalCostPersonArchivesMapper.insertMedicalCostPersonArchives(medicalCostPersonArchives);
    }

    /**
     * 修改个人档案
     * 
     * @param medicalCostPersonArchives 个人档案
     * @return 结果
     */
    @Override
    public int updateMedicalCostPersonArchives(MedicalCostPersonArchives medicalCostPersonArchives)
    {
        return medicalCostPersonArchivesMapper.updateMedicalCostPersonArchives(medicalCostPersonArchives);
    }

    /**
     * 批量删除个人档案
     * 
     * @param ids 需要删除的个人档案主键
     * @return 结果
     */
    @Override
    public int deleteMedicalCostPersonArchivesByIds(String[] ids)
    {
        return medicalCostPersonArchivesMapper.deleteMedicalCostPersonArchivesByIds(ids);
    }

    /**
     * 删除个人档案信息
     * 
     * @param id 个人档案主键
     * @return 结果
     */
    @Override
    public int deleteMedicalCostPersonArchivesById(String id)
    {
        return medicalCostPersonArchivesMapper.deleteMedicalCostPersonArchivesById(id);
    }
}
