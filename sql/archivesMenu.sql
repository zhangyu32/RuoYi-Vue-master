-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('个人档案', '2000', '1', 'archives', 'archives/archives/index', 1, 0, 'C', '0', '0', 'archives:archives:list', '#', 'admin', sysdate(), '', null, '个人档案菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('个人档案查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'archives:archives:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('个人档案新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'archives:archives:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('个人档案修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'archives:archives:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('个人档案删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'archives:archives:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('个人档案导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'archives:archives:export',       '#', 'admin', sysdate(), '', null, '');