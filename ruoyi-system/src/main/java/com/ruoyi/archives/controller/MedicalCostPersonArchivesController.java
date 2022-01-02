package com.ruoyi.archives.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.archives.domain.MedicalCostPersonArchives;
import com.ruoyi.archives.service.IMedicalCostPersonArchivesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 个人档案Controller
 * 
 * @author 张裕
 * @date 2022-01-02
 */
@RestController
@RequestMapping("/archives/archives")
public class MedicalCostPersonArchivesController extends BaseController {
    @Autowired
    private IMedicalCostPersonArchivesService medicalCostPersonArchivesService;

    /**
     * 查询个人档案列表
     */
    @PreAuthorize("@ss.hasPermi('archives:archives:list')")
    @GetMapping("/list")
    public TableDataInfo list(MedicalCostPersonArchives medicalCostPersonArchives)
    {
        startPage();
        List<MedicalCostPersonArchives> list = medicalCostPersonArchivesService.selectMedicalCostPersonArchivesList(medicalCostPersonArchives);
        return getDataTable(list);
    }

    /**
     * 导出个人档案列表
     */
    @PreAuthorize("@ss.hasPermi('archives:archives:export')")
    @Log(title = "个人档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MedicalCostPersonArchives medicalCostPersonArchives)
    {
        List<MedicalCostPersonArchives> list = medicalCostPersonArchivesService.selectMedicalCostPersonArchivesList(medicalCostPersonArchives);
        ExcelUtil<MedicalCostPersonArchives> util = new ExcelUtil<MedicalCostPersonArchives>(MedicalCostPersonArchives.class);
        util.exportExcel(response, list, "个人档案数据");
    }

    /**
     * 获取个人档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('archives:archives:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(medicalCostPersonArchivesService.selectMedicalCostPersonArchivesById(id));
    }

    /**
     * 新增个人档案
     */
    @PreAuthorize("@ss.hasPermi('archives:archives:add')")
    @Log(title = "个人档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MedicalCostPersonArchives medicalCostPersonArchives)
    {
        return toAjax(medicalCostPersonArchivesService.insertMedicalCostPersonArchives(medicalCostPersonArchives));
    }

    /**
     * 修改个人档案
     */
    @PreAuthorize("@ss.hasPermi('archives:archives:edit')")
    @Log(title = "个人档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MedicalCostPersonArchives medicalCostPersonArchives)
    {
        return toAjax(medicalCostPersonArchivesService.updateMedicalCostPersonArchives(medicalCostPersonArchives));
    }

    /**
     * 删除个人档案
     */
    @PreAuthorize("@ss.hasPermi('archives:archives:remove')")
    @Log(title = "个人档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(medicalCostPersonArchivesService.deleteMedicalCostPersonArchivesByIds(ids));
    }
}
