import './App.css';
import GetUsersTest from './GetUsersTest';
import ExampleScan from './GetExampleScan';
import React, {Fragment} from 'react';

const App = () => {

  return (
      <React.Fragment>
          <div>
            <GetUsersTest />
          </div>
          <div>
            <ExampleScan />
          </div>
      </React.Fragment>
  );
}

export default App;