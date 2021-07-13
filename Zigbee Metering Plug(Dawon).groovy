/**
 *  Copyright 2019 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
import physicalgraph.zigbee.zcl.DataType

metadata {
    definition (name: "Zigbee Metering Plug(Dawon)", namespace: "trustsmile56703", author: "trustsmile56703", ocfDeviceType: "oic.d.smartplug", mnmn: "SmartThingsCommunity", vid: "0f8fd8f2-7b36-3f69-b840-a2d0322e20bf") {
        capability "Energy Meter"
        capability "Power Meter"
        capability "Actuator"
        capability "Switch"
        capability "Refresh"
        capability "Health Check"
        capability "Sensor"
        capability "Configuration"
        capability "trustsmile56703.penergy"
//	    capability "trustsmile56703.energywon"
        capability "trustsmile56703.energytowon"
//      capability "trustsmile56703.checkInDay"
        attribute "energyToWonMulti", "number"
		capability "Momentary"
	    command "reset"

        fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0B04, 0702, FC82", outClusters: "0003, 000A, 0019", manufacturer: "LDS", model: "ZB-ONOFFPlug-D0000",  deviceJoinName: "Outlet" //Smart Plug
        fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0B04, 0702, FC82", outClusters: "0003, 000A, 0019", manufacturer: "LDS", model: "ZB-ONOFFPlug-D0005",  deviceJoinName: "Outlet" //Smart Plug
        fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0702, 0B04", outClusters: "0003", manufacturer: "REXENSE", model: "HY0105", deviceJoinName: "HONYAR Outlet" //HONYAR Smart Outlet (USB)
        fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0702, 0B04", outClusters: "0003", manufacturer: "REXENSE", model: "HY0104", deviceJoinName: "HONYAR Outlet" //HONYAR Smart Outlet
        fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0009, 0702, 0B04", outClusters: "0003, 0019", manufacturer: "HEIMAN", model: "E_Socket", deviceJoinName: "HEIMAN Outlet" //HEIMAN Smart Outlet
        fingerprint profileId: "0104", inClusters: "0000, 0003, 0004, 0005, 0006, 0B04, 0702, FC82", outClusters: "0003, 000A, 0019", manufacturer: "sengled", model: "E1C-NB7",  deviceJoinName: "Sengled Outlet" //Sengled Smart Plug with Energy Tracker
        fingerprint profileId: "0104", manufacturer: "frient A/S", model: "SPLZB-131",  deviceJoinName: "frient Outlet" // frient smart plug mini, raw description: 02 0104 0051 10 09 0000 0702 0003 0009 0B04 0006 0004 0005 0002 05 0000 0019 000A 0003 0406
        fingerprint profileId: "0104", manufacturer: "frient A/S", model: "SPLZB-132",  deviceJoinName: "frient Outlet" // frient smart plug mini, raw description: 02 0104 0051 10 09 0000 0702 0003 0009 0B04 0006 0004 0005 0002 05 0000 0019 000A 0003 0406
        fingerprint profileId: "0104", manufacturer: "frient A/S", model: "SPLZB-134",  deviceJoinName: "frient Outlet" // frient smart plug mini, raw description: 02 0104 0051 10 09 0000 0702 0003 0009 0B04 0006 0004 0005 0002 05 0000 0019 000A 0003 0406
        fingerprint profileId: "0104", manufacturer: "frient A/S", model: "SPLZB-137",  deviceJoinName: "frient Outlet" // frient smart plug mini, raw description: 02 0104 0051 10 09 0000 0702 0003 0009 0B04 0006 0004 0005 0002 05 0000 0019 000A 0003 0406
        fingerprint profileId: "0104", manufacturer: "frient A/S", model: "SMRZB-143",  deviceJoinName: "frient Outlet" // frient smart cable, raw description: 02 0104 0051 10 09 0000 0702 0003 0009 0B04 0006 0004 0005 0002 05 0000 0019 000A 0003 0406
        fingerprint manufacturer: "Jasco Products", model: "43095", deviceJoinName: "Enbrighten Outlet" //Enbrighten Plug-in Smart Switch With Energy Monitoring 43095, Raw Description: 01 0104 0100 00 07 0000 0003 0004 0005 0006 0702 0B05 02 000A 0019
        fingerprint manufacturer: "Jasco Products", model: "43132", deviceJoinName: "Jasco Outlet" //Enbrighten In-Wall Smart Outlet With Energy Monitoring 43132, Raw Description: 01 0104 0100 00 07 0000 0003 0004 0005 0006 0702 0B05 02 000A 0019
        fingerprint manufacturer: "Jasco Products", model: "43078", deviceJoinName: "Enbrighten Switch", ocfDeviceType: "oic.d.switch" //Enbrighten In-Wall Smart Switch With Energy Monitoring 43078, Raw Description: 01 0104 0100 00 07 0000 0003 0004 0005 0006 0702 0B05 02 000A 0019
        fingerprint manufacturer: "DAWON_DNS", model: "PM-B430-ZB", deviceJoinName: "Dawon Outlet" // DAWON DNS Smart Plug PM-B430-ZB (10A), raw description: 01 0104 0051 01 07 0000, 0004, 0003, 0006, 0019, 0702, 0B04 07 0000, 0004, 0003, 0006, 0019, 0702, 0B04
        fingerprint manufacturer: "DAWON_DNS", model: "PM-B530-ZB", deviceJoinName: "Dawon Outlet" // DAWON DNS Smart Plug PM-B530-ZB (16A), raw description: 01 0104 0051 01 07 0000, 0004, 0003, 0006, 0019, 0702, 0B04 07 0000, 0004, 0003, 0006, 0019, 0702, 0B04
        fingerprint manufacturer: "DAWON_DNS", model: "PM-B540-ZB", deviceJoinName: "Dawon Outlet" // DAWON DNS Smart Plug PM-B530-ZB (16A), raw description: 01 0104 0051 01 06 0000 0002 0003 0006 0702 0B04 02 0003 0019
        fingerprint manufacturer: "DAWON_DNS", model: "PM-C140-ZB", deviceJoinName: "Dawon Outlet" // DAWON DNS In-Wall Outlet PM-C140-ZB, raw description: 01 0104 0051 01 0A 0000 0002 0003 0004 0006 0019 0702 0B04 0008 0009 0A 0000 0002 0003 0004 0006 0019 0702 0B04 0008 0009
	}
    preferences
    {
        input name: "checkInDay", title:"검침일" , type: "text", required: true, defaultValue: 1
        input name: "highLowTension", title:"주택저압이면 1, 주택고압이면 2 선택" , type: "text", required: true, defaultValue: 1
        input name: "progressivePower", title:"누진단계 설정 1단계~3단계: 1~3" , type: "text", required: true, defaultValue: 2
	}
    tiles(scale: 2){
        multiAttributeTile(name:"switch", type: "generic", width: 6, height: 4, canChangeIcon: true){
                tileAttribute("device.switch", key: "PRIMARY_CONTROL") {
                        attributeState("on", label: '${name}', action: "switch.off", icon: "st.switches.switch.on", backgroundColor: "#00a0dc")
                        attributeState("off", label: '${name}', action: "switch.on", icon: "st.switches.switch.off", backgroundColor: "#ffffff")
                }
        }
        valueTile("power", "device.power", decoration: "flat", width: 2, height: 2) {
                state "default", label:'${currentValue} W'
        }
        valueTile("energy", "device.energy", decoration: "flat", width: 2, height: 2) {
                state "default", label:'${currentValue} kWh'
        }
        standardTile("refresh", "device.power", inactiveLabel: false, decoration: "flat", width: 2, height: 2) {
                state "default", label:'', action:"refresh.refresh", icon:"st.secondary.refresh"
        }
        standardTile("reset", "device.energy", inactiveLabel: false, decoration: "flat", width: 2, height: 2) {
                state "default", label:'reset kWh', action:"reset"
        }
        valueTile("energywon", "device.energywon", decoration: "flat",  width: 2, height: 2) {
            state "default", label: '${currentValue}'
        }
        valueTile("pEnergy", "device.pEnergy", decoration: "flat",  width: 2, height: 2) {
            state "default", label: '${currentValue} kWh'
        }

        main(["switch"])
        details(["switch","power","energy","refresh","energywon","pEnergy","reset"])
    }
}

def getATTRIBUTE_READING_INFO_SET() { 0x0000 }
def getATTRIBUTE_HISTORICAL_CONSUMPTION() { 0x0400 }

def parse(String description) {
    log.debug "description is $description"
    def event = zigbee.getEvent(description)
    def descMap = zigbee.parseDescriptionAsMap(description)

    if (event) {
        log.info "event enter:$event"
        if (event.name == "switch" && !descMap.isClusterSpecific && descMap.commandInt == 0x0B) {
            log.info "Ignoring default response with desc map: $descMap"
            return [:]
        } else if (event.name== "power") {
            event.value = event.value/getPowerDiv()
            event.unit = "W"
        } else if (event.name== "energy") {
            event.value = event.value/getEnergyDiv()
            event.unit = "kWh"
        }
        log.info "event outer:$event"
        sendEvent(event)
    } else {
        List result = []
        log.debug "Desc Map: $descMap"

        List attrData = [[clusterInt: descMap.clusterInt ,attrInt: descMap.attrInt, value: descMap.value]]
        descMap.additionalAttrs.each {
            attrData << [clusterInt: descMap.clusterInt, attrInt: it.attrInt, value: it.value]
        }

        attrData.each {
                def map = [:]
                if (it.value && it.clusterInt == zigbee.SIMPLE_METERING_CLUSTER && it.attrInt == ATTRIBUTE_HISTORICAL_CONSUMPTION) {
                        log.debug "power"
                        map.name = "power"
                        map.value = zigbee.convertHexToInt(it.value)/getPowerDiv()
                        map.unit = "W"
                }
                else if (it.value && it.clusterInt == zigbee.SIMPLE_METERING_CLUSTER && it.attrInt == ATTRIBUTE_READING_INFO_SET) {
                        map.name = "energy"
                        map.value = zigbee.convertHexToInt(it.value)/getEnergyDiv()
                        map.unit = "kWh"
                        def energy = map.value
                        def energytowonmulti = device.currentState("energyToWonMulti").doubleValue
						def won = Math.round(energy * energytowonmulti)
						sendEvent(name: "energywon", value: won, unit: "원", displayed: true)
                }

                if (map) {
                        result << createEvent(map)
                }
                log.debug "Parse returned $map"
        }
        return result
    }
}

def off() {
    def cmds = zigbee.off()
    if (device.getDataValue("model") == "HY0105") {
        cmds += zigbee.command(zigbee.ONOFF_CLUSTER, 0x00, "", [destEndpoint: 0x02])
    }
    return cmds
}


def on() {
    def cmds = zigbee.on()
    if (device.getDataValue("model") == "HY0105") {
        cmds += zigbee.command(zigbee.ONOFF_CLUSTER, 0x01, "", [destEndpoint: 0x02])
    }
    return cmds
}

/**
 * PING is used by Device-Watch in attempt to reach the Device
 * */
def ping() {
    return refresh()
}

def refresh() {
    log.debug "refresh"
    zigbee.onOffRefresh() +
    zigbee.electricMeasurementPowerRefresh() +
    zigbee.readAttribute(zigbee.SIMPLE_METERING_CLUSTER, ATTRIBUTE_READING_INFO_SET)
}

def push(){
    log.debug "pushed"
    reset()
}

def configure() {
    // this device will send instantaneous demand and current summation delivered every 1 minute
    sendEvent(name: "checkInterval", value: 2 * 60 + 10 * 60, displayed: false, data: [protocol: "zigbee", hubHardwareId: device.hub.hardwareID])
    log.debug "Configuring Reporting"
    return refresh() +
    	   zigbee.onOffConfig() +
           zigbee.configureReporting(zigbee.SIMPLE_METERING_CLUSTER, ATTRIBUTE_READING_INFO_SET, DataType.UINT48, 1, 600, 1) +
           zigbee.electricMeasurementPowerConfig(1, 600, 1) +
           zigbee.simpleMeteringPowerConfig()
}

private int getPowerDiv() {
    (isSengledOutlet() || isJascoProductsOutlet()) ? 10 : 1
}
//Add DAWON_DNS
private int getEnergyDiv() {
    (isSengledOutlet() || isJascoProductsOutlet()) ? 10000 : (isFrientOutlet() || isDowonOutlet()) ? 1000 : 100
}

private boolean isSengledOutlet() {
    device.getDataValue("model") == "E1C-NB7"
}

private boolean isJascoProductsOutlet() {
    device.getDataValue("manufacturer") == "Jasco Products"
}

private boolean isFrientOutlet() {
    device.getDataValue("manufacturer") == "frient A/S"
}
//devide
private boolean isDowonOutlet() {
    device.getDataValue("manufacturer") == "DAWON_DNS"
}
//set penergy = 0
def installed() {
	log.debug "Installed ${device.displayName}"
    sendEvent(name: "pEnergy", value: 0, unit: "kWh", displayed: true)
	refresh()
}

def updated() {
  log.debug "updated"
  def energyToWonMulti = 0
  if(highLowTension == "1"){
    if(progressivePower == "1"){
      energyToWonMulti=88.3
    }
    else if(progressivePower == "2"){
      energyToWonMulti=182.9
    }
    else{
      energyToWonMulti=275.6
    }
  }
  else{
    if(progressivePower == "1"){
      energyToWonMulti=73.3
    }
    else if(progressivePower == "2"){
      energyToWonMulti=142.3
    }
    else{
      energyToWonMulti=210.6
    }
  }
  log.debug "energyToWonMulti: ${energyToWonMulti}"
	sendEvent(name: "energyToWonMulti", value: energyToWonMulti, displayed: true)
  schedule("0 0 0 ${checkInDay.value} * ?", reset)
  //s m h d m w y
}
//reset with backup
def reset(){
	log.debug "reset"
	def pEnergy = device.currentState("energy").value
	sendEvent(name: "pEnergy", value: pEnergy, unit: "kWh", displayed: true)
    zigbee.writeAttribute(zigbee.SIMPLE_METERING_CLUSTER, 0x0099, DataType.UINT8, 00)
}