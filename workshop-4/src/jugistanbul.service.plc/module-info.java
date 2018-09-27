module jugistanbul.service.plc {
    requires jugistanbul.service.core;
    provides jugistanbul.service.core.DataService with jugistanbul.service.plc.PLCDataProvider;
}