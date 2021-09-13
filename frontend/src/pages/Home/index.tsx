import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";


const Home = () => {
  return (
    
    <>
    <NavBar />
    <div className="container">
        <h1 className="text-primary"> Home </h1>
      <div className="text-primary py-3">
        <div className="row px-3">  
          <h5 className="text-center text-secondary">Ir para Dashboard: <a href="/dashboard"> Clique Aqui </a></h5>
        </div>
      </div>
      </div>
    <Footer />
    </>
    
  );
}

export default Home;