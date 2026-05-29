# Cisco Video Conferencing Devices – Capabilities & Configuration

Symphony connects to Cisco video conferencing devices over the network to give you a live view of each room's status — idle, in a call, or experiencing a problem. You can see real-time device health, call details, room occupancy, and take control actions directly from the Symphony dashboard.

---

## 2. Main Use Cases

- **Monitor** device health and call status in real time
- **Control** audio — mute microphones, adjust volume, toggle auto-answer
- **Control** cameras — pan, tilt, zoom, and selfview settings
- **Schedule** point-to-point meetings between two Cisco-enabled rooms
- **Manage** standby behavior, network services, and device settings
- **Inventory** serial number, firmware version, uptime, and network addresses

---

## 3. How It Works

Symphony connects to each Cisco device using the device's built-in web interface, sending control instructions directly to the device.

**API polling rate:** The default API polling rate for the Cisco XML API integration is fixed and not published in available documentation. Symphony checks each device on a fixed internal schedule that cannot be changed. Contact AVI-SPL support for the exact value.

When connected, a horizontal **Monitoring status** pipeline shows Link, Login, and API indicators (green = working, red = error), plus a **Last updated** timestamp.

---

## 4. What You Need Before Starting (Prerequisites)

| What you need | What it is | Where to get it |
|---|---|---|
| Device IP address | Network address of the Cisco device | IT team |
| Admin username | Administrator login name | IT team |
| Admin password | Administrator password | IT team |
| Port number | Default: **443** | IT team (if non-standard) |

---

## 5. Setting Up the Device in Symphony (Step by Step)

To configure the Cisco XML API integration, open the **Edit Device** page in Symphony → **Information** tab.

**Top section:**
Name, Active (checked), Type: **Codecs**, Category: **Single Codecs**, Manufacturer: **Cisco**, Model (exact model), Account, Location, Room

**Monitoring section:**
Monitoring Service: **Advanced Monitoring** | Ping Protocol: **ICMP** | Monitoring Source: **Direct**

**Network section:**
Management Address: device IP address

**Call Information section:**
Protocol: SIP Only / H323 Only / Auto; Calling Method: Auto; fill Gatekeeper IP, SIP Registrar, E.164, H.323 ID, or SIP URI as applicable

**Management Interface section:**
Protocol: HTTP (checked) | Secure: as required | Username / Password: admin credentials | Local Port: **443**

**Adapter Properties section:**

| Field | What to enter |
|---|---|
| displayPropertyGroups | Group names comma-separated (e.g., `Audio,Cameras,Conference`), or **All**. Default shows only RoomAnalytics and SystemUnit. |
| maxStatusPollAttempt | Leave blank; raise up to **30** only if call status lags after dialing |

Click **Save**. Verify Link, Login, and API show green in the Monitoring status pipeline.

---

## 6. Property Groups — What Data Symphony Can Show

**Available Property Groups:**
ActiveCall, Audio, Cameras, Conference, ConferenceCapabilities, H323, Networks, NetworkServices, ProximityServices, RoomAnalytics, Security, SIP, Standby, SystemTime, SystemUnit, UserInterface, Video, VideoSelfView

For details on each group, see the [Symphony Knowledge Base](https://symphony.knowledgeowl.com/help/cisco-http-xmlapi).

### Monitoring Properties — Complete List

This integration reports all status and configuration values across the 18 property groups listed above. All monitoring properties available from Cisco Collaboration Endpoint (CE) enabled devices are accessible through Symphony when the corresponding group is enabled.

---

## 7. Device Controls — What You Can Do from Symphony

### Device Control Capabilities

- **Call** button (device card, left panel) — place a SIP or H.323 call; changes to **Disconnect** during an active call
- **Extended Properties** (puzzle-piece icon in Monitoring status pipeline) — access full configuration controls for audio, cameras, conference, standby, network services, user interface, video, and selfview

For a complete reference, see the [Symphony Knowledge Base](https://symphony.knowledgeowl.com/help/cisco-http-xmlapi).

---

## 8. Meeting Scheduling

Symphony supports point-to-point meeting scheduling between two Cisco-enabled rooms. Active calls appear on the room's calendar view as scheduled or ad-hoc.

---

## 9. Supported Devices — Applicable Device Models

The Cisco XML API integration is applicable to the following device models (all require **Cisco Collaboration Endpoint Software v9.x** or later):

| Device Family | Applicable Models |
|---|---|
| SX Series | SX10, SX20, SX80 |
| MX Series | MX200 G2, MX300 G2, MX700, MX800 |
| DX Series | DX70, DX80 |
| Room Series | Room Kit, Room Kit Mini, Room 55, Room 55 Dual, Room 70, Room 70 G2 |
| Codec Series | Codec Plus, Codec Pro |
| Board Series | Board 55, 55S, 70, 70S, 85S |

Unlisted models running CE Software v9.x or later may also be supported — contact AVI-SPL support.

---

## 10. Limitations

- **API polling rate is not configurable.** Symphony checks on a fixed internal schedule. `maxStatusPollAttempt` (default: 10, max: 30) only affects status checks immediately after dialing.
- Point-to-point scheduling only — multipoint (3+ rooms) is not supported.
- Only RoomAnalytics and SystemUnit groups show by default; enable others manually in Adapter Properties.
- ActiveCall group appears only during an active call.
- Security group is read-only.
- No call history — only current call state is accessible.

---

## 11. Troubleshooting

| Symptom | First steps |
|---|---|
| **Link** indicator red | Check device is powered on; confirm Management Address; verify port 443 is open |
| **Login** indicator red | Re-enter credentials in Management Interface section; confirm admin-level account |
| **API** indicator red | Confirm device runs CE Software v9.x or later; verify Local Port is 443 |
| No data in Extended Properties | Set `displayPropertyGroups` to **All** in Adapter Properties → **Save** |
| Status stays Idle after dialing | Increase `maxStatusPollAttempt` (up to 30) in Adapter Properties |
| Call/Disconnect button unresponsive | Confirm Link, Login, and API are all green |

For unresolved issues, [submit an SOS ticket](https://avi-spl.atlassian.net/servicedesk/customer/portals).

---

## 12. What AI Assistant Can Do

- Find Cisco devices in Symphony and confirm their connection status
- Read real-time room occupancy, audio status, camera details, and active call information
- Read device hardware details — serial number, firmware version, uptime
- Read network information, conference settings, and H.323/SIP registration status
- Report standby state, time zone, and user interface configuration
- Read video and selfview configuration

---

## 13. What AI Assistant Cannot Do

- Create or provision Cisco devices — each must be added manually
- Execute calls without user action — a user must click the Call button
- Schedule multipoint meetings (3+ rooms) — only point-to-point between two rooms is supported
- Retrieve historical call records — only current call state is accessible
- Modify firmware, security settings, or device certificates
