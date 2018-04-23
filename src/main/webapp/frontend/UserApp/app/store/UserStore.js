Ext.define('UserApp.store.UserStore', {
	extend: 'Ext.data.Store',
	model: 'UserApp.model.UserModel',
	autoLoad: true,

	proxy: {
		type: 'rest',
		method: 'GET',
		url: 'http://localhost:8080/users',
		reader: {
			type: 'json',
			root: 'users',
			successProperty: 'success'
		}
	}
});