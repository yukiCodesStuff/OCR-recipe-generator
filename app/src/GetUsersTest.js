import React, {useEffect, useState} from 'react'
import './GetUsersTest.css'

export default function GetUsersTest() {

    const [scannedData, updateData] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        setLoading(true);

        fetch('/user/get-users')
            .then(response => response.json())
            .then(data => {
                updateData(data);
                setLoading(false);
            })
    }, []);

    if (loading) {
        return <p>Loading...</p>;
    }

    return (
        <div>
            {scannedData.map(customer =>
            <div className="customerinfocontainer" key={customer.id}>
                <h1>{customer.name}</h1>
                <ul>
                    <li>
                        {customer.age}
                    </li>
                    <li>
                        {customer.dob}
                    </li>
                    <li>
                        {customer.email}
                    </li>
                    <li>
                        {customer.language}
                    </li>
                </ul>
            </div>
            )}
        </div>
    );
}