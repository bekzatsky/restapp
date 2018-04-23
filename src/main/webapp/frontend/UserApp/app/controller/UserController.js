Ext.define('UserApp.controller.UserController', {
    extend: 'Ext.app.Controller',

    views: [
    'UserView',
    'Edit'],

    stores: [
    'UserStore'
    ],

    models: ['UserModel'],

    init: function() {
        this.control({
            'viewport > userlist': {
                itemdblclick: this.editUser
            },
            'useredit button[action=save]': {
                click: this.updateUser
            }
        })
    },

    editUser: function(grid, record) {
        var view = Ext.widget('useredit');
        view.down('form').loadRecord(record);
    },

    updateUser: function(button) {
        console.log('clicked the Save button');
    }
});