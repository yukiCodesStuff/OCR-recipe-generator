import React, {useEffect, useState} from 'react'

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
            <div key={customer.id}>
                <p>
                    {customer.name} {customer.language}
                </p>
            </div>
            )}
        </div>
    );
}