
case class Report(
        id: String, 
        DroneID: Int, 
        GeoLoc:Location, 
        SurroundingCitizen: List[Citizen], 
        WordsHeard: List[String], 
        ReportTime: String
        )
    