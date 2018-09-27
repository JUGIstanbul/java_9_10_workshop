module jugistanbul.service.opc {
    requires jugistanbul.service.core;
    provides jugistanbul.service.core.DataService with jugistanbul.service.opc.OPCDataProvider;
}