Ext.define('UserApp.view.UserView' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.userlist',

    title: 'All Users',
    store: 'UserStore',

    initComponent: function() {
        
        this.columns = [
            {header: 'ID',  dataIndex: 'id',  flex: 1},
            {header: 'First name', dataIndex: 'firstName', flex: 1},
            {header: 'Last name', dataIndex: 'lastName', flex: 1},
            {header: 'Age',  dataIndex: 'age',  flex: 1}
        ];

        this.callParent(arguments);
    }
});