import './GetExampleScan.css'
import React, {useEffect, useState} from "react";

export default function ExampleScan() {
    const [ocrData, updateOcrData] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        setLoading(true);

        fetch('/scan/example-image')
            .then(response => {
                response.json();
                console.log(response);
            })
            .then(data => {
                console.log(data);
                updateOcrData(data);
                setLoading(false);
            })
    }, []);

    if (loading) {
        return <p>Loading...</p>;
    }

    return(
        <div>
            <h1>Scanned Test Data!</h1>
            <p>
                {ocrData}
            </p>
        </div>
    );

}